package ShopOThoiTrangNam.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ShopOThoiTrangNam.entity.Cart;
import ShopOThoiTrangNam.entity.CartDetails;
import ShopOThoiTrangNam.entity.Order;
import ShopOThoiTrangNam.entity.OrderDetails;
import ShopOThoiTrangNam.entity.Product;
import ShopOThoiTrangNam.entity.ProductDetails;
import ShopOThoiTrangNam.entity.ProductDetailsRepository;
import ShopOThoiTrangNam.entity.User;
import ShopOThoiTrangNam.service.CartDetailsService;
import ShopOThoiTrangNam.service.CartService;
import ShopOThoiTrangNam.service.OrderDetailsService;
import ShopOThoiTrangNam.service.OrderService;
import ShopOThoiTrangNam.service.ProductDetailsRepositoryService;
import ShopOThoiTrangNam.service.ProductDetailsService;
import ShopOThoiTrangNam.service.ProductService;
import ShopOThoiTrangNam.service.UserService;

@Controller
public class HomeControll {
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	@Autowired
	CartService cartService;
	@Autowired
	ProductDetailsService productDetailsService;
	@Autowired
	ProductDetailsRepositoryService productDetailsRepositoryService;
	@Autowired
	CartDetailsService cartDetailsService;
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetailsService orderDetailsService;
	@GetMapping(value = { "/", "/index" })
	public String index(Model model, HttpSession session) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		return "user/index";
	}

	@GetMapping("/type")
	public String allProductType(Model model, @RequestParam(name = "productByType") String type) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		List<Product> listProductByType = productService.productByType(type);
		model.addAttribute("listProductByType", listProductByType);

		return "user/product-listing";
	}

	@PostMapping("/search")
	public String searchProduct(Model model, @RequestParam(name = "search") String name) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		List<Product> listProductSearchByName = productService.searchProduct(name);
		model.addAttribute("listProductByType", listProductSearchByName);
		return "user/product-listing";
	}

	@GetMapping("/product")
	public String productDetails(Model model, @RequestParam(name = "productId") int productId) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		Product product = productService.getProductById(productId);
		model.addAttribute("productdetail", product);

		// get list size for product
		Set<String> listSize = new HashSet<String>();
		for (ProductDetails details : product.getProductDetails()) {
			for (ProductDetailsRepository repository : details.getProductDetailsRepositories()) {
				listSize.add(repository.getProductDetailsRepositorySize());

			}
		}

		Set<String> listColor = new HashSet<String>();
		for (ProductDetails details : product.getProductDetails()) {
			listColor.add(details.getProductDetailsColor());
		}
		model.addAttribute("listColor", listColor);

		model.addAttribute("listSize", listSize);

		return "user/product-detail";
	}

	@GetMapping("/login")
	public String login(Model model) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		return "user/login";
	}

	@PostMapping("/login")
	public String logincheck(Model model, HttpSession session, @RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		
		
		if(email.isEmpty() || password.isEmpty()) {
			String errornull = "nhập tài khoản và mật khẩu";
			model.addAttribute("errornull", errornull);
			return "user/login";
		}
		User user2 = userService.checkUser(email);
		if(user2 == null || !user2.getUserPassword().equals(password)) {
			String errorlogin = "Sai tài khoản hoặc mật khẩu";
			model.addAttribute("errorlogin", errorlogin);
			return "user/login";
		}
		session.setAttribute("userid", user2.getUserId());
		session.setAttribute("username", user2.getUserName());
		session.setAttribute("useremail", user2.getUserEmail());
		session.setAttribute("useraddress", user2.getUserAddress());
		session.setAttribute("userid", user2.getUserId());
		session.setAttribute("userphone", user2.getUserPhone());
//		model.addAttribute("user", user2);

		// lay du lieu tu gio hang cua nguoi dung gui vao session
		
		Cart cart = cartService.getCartByUser(user2);
		List<CartDetails> listCart = cartDetailsService.getListCartDetailsByUser(cart);
		session.setAttribute("listCart", listCart);
		

		return "user/index";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, Model model) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		session.removeAttribute("username");
		session.removeAttribute("useremail");
		session.removeAttribute("useraddress");
		session.removeAttribute("userid");
		session.removeAttribute("userphone");

		return "user/index";
	}

	@GetMapping("/sign-up")
	public String signup(Model model) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		return "user/sign-up";
	}

	@PostMapping("/send-signup")
	public String checkSignup(Model model, @RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password,
			@RequestParam(name = "forgetpassword") String forgetPassword,
			@RequestParam(name = "address") String address, @RequestParam(name = "phone") String phone,
			@RequestParam("username") String username, HttpSession session) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);

		User user = userService.checkUser(email);
		User user2 = userService.findByUserPhone(phone);
		if (user != null || user2 != null) {
			String errorEmail = "email hoặc số điện thoại đã được sử dụng";
			model.addAttribute("errorEmail", errorEmail);
			return "user/sign-up";
		}

		else if (!password.equalsIgnoreCase(forgetPassword) || password.length() < 6) {
			String error = "Mật khẩu phải giống nhau và lớn hơn 6 kí tự";
			model.addAttribute("error", error);
			return "user/sign-up";
		}
		User adduser = new User();
		adduser.setUserAddress(address);
		adduser.setUserEmail(email);
		adduser.setUserName(username);
		adduser.setUserPassword(password);
		adduser.setUserPhone(phone);
		userService.save(adduser);

		session.setAttribute("username", username);
		session.setAttribute("useremail", email);
		session.setAttribute("useraddress", address);
		session.setAttribute("userid", userService.checkUser(email).getUserId());
		session.setAttribute("userphone", phone);
		
		Cart cart = new Cart();
		cart.setUsers(adduser);
		cartService.save(cart);
		return "user/index";
	}

	@GetMapping("/addToCart")
	public String addToCart(Model model, HttpSession session, @RequestParam(name = "productcolor") String color,
			@RequestParam(name = "productsize") String size, @RequestParam(name = "amount") int amount,
			@RequestParam(name = "productid") int productId) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		
		
		int userid = (int) session.getAttribute("userid");
		User user = userService.getById(userid);
		
		//khi nguoi dung them san pham moi. neu nguoi dung chua ton tai gio hang => them gio hang moi
		Cart cart = cartService.getCartByUser(user);
		if (cart == null) {
			Cart cart1 = new Cart();
			cart1.setUsers(user);
			cartService.save(cart);
		}

		// them mat hang vao chi tiet gio hang
		Product productAddToCart = productService.getProductById(productId);
		ProductDetails productDetailsAddToCart = productDetailsService.getProductDetailsForCart(productAddToCart,
				color);

		ProductDetailsRepository productDetailsRepository = productDetailsRepositoryService
				.getProductDetailsRepositoryForCartDetails(productDetailsAddToCart, size);

		//
		CartDetails cartDetails = cartDetailsService.getCartDetailsByProductDetailsRepository(cart,
				productDetailsRepository);
		if (cartDetails == null) { // neu gio hang chua ton tai san pham thi them san pham moi
			CartDetails cartDetails1 = new CartDetails();
			cartDetails1.setAmount(amount);
			cartDetails1.setCart(cart);
			cartDetails1.setProductDetailsRepository(productDetailsRepository);
			cartDetailsService.save(cartDetails1);
		}
		// khoi tao lai session
		List<CartDetails> listCart = cartDetailsService.getListCartDetailsByUser(cart);
		session.setAttribute("listCart", listCart);
		return "user/cart";
	}
	@GetMapping("/payment")
	public String payment(Model model) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		return "user/cart";
	}
	
	@GetMapping("/remove")
	public String removeProductByCart(@RequestParam("cartId") int CartDetailId, HttpSession session,Model model) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		
		//get cartdetailid and delete product by id cartdertailid
		cartDetailsService.deleteById(CartDetailId);
		
		// delete session
		session.removeAttribute("listCart");
		
		// create session cart
		String useremail = (String) session.getAttribute("useremail");
		User user2 = userService.checkUser(useremail);
		Cart cart = cartService.getCartByUser(user2);
		List<CartDetails> listCart = cartDetailsService.getListCartDetailsByUser(cart);
		session.setAttribute("listCart", listCart);
		return "user/cart";
	}
	@GetMapping("/checkout")
	public String checkOutOrder(Model model,HttpSession session) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		
		return "user/checkout";
	}
	@PostMapping("/order")
	public String order(Model model,HttpSession session,@RequestParam(name = "usernote") String usernote,
			@RequestParam(name = "useremail") String useremail,
			@RequestParam(name ="userphone") String userPhone, @RequestParam("username") String username,
			@RequestParam("useraddress") String userAddress) {
		List<String> allType = productService.getAllType();
		model.addAttribute("allType", allType);
		
		int userid = (int) session.getAttribute("userid");
		User user = userService.getById(userid);
		user.setUserName(username);
		user.setUserEmail(useremail);
		user.setUserAddress(userAddress);
		user.setUserPhone(userPhone);
		userService.save(user); // save informational late order
		
		// luu du lieu vao bang order va orderdetails
		List<CartDetails> listCart =  (List<CartDetails>) session.getAttribute("listCart");
		Order order = new Order();
		Date date = new Date();
		order.setDate(date);
		order.setUser(user);
		order.setNote(usernote);
		orderService.save(order);
		
		for(CartDetails cartDetails : listCart) {
			OrderDetails orderDetails = new OrderDetails();
			orderDetails.setAmount(cartDetails.getAmount());
			orderDetails.setOrder(order);
			orderDetails.setOrderDetailsProductDetailsRepository(cartDetails.getProductDetailsRepository());
			orderDetailsService.save(orderDetails);
			session.removeAttribute("listCart");
			
			//productdetailrepository amount and sales forget by orderdetails
			int productDetailsRepositoryId = cartDetails.getProductDetailsRepository().getProductDetailsRepositoryId();
			ProductDetailsRepository productDetailsRepository = productDetailsRepositoryService.getById(productDetailsRepositoryId);
			productDetailsRepository.setProductDetailsRepositoryAmount(productDetailsRepository
					.getProductDetailsRepositoryAmount()-cartDetails.getAmount());
			productDetailsRepository.setProductDetailsRepositorySales(productDetailsRepository
					.getProductDetailsRepositorySales()+cartDetails.getAmount());
				
			// ordersussess delete cart
		cartDetailsService.delete(cartDetails);
		}
		return "user/ordersuccess";
	}
}
