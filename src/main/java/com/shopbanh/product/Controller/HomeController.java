package com.shopbanh.product.Controller;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(path="products")
public class HomeController {
    //http:localhost:8080/products
    @RequestMapping(value="",method = RequestMethod.GET)
    public String homePage(ModelMap modelMap) {
        return "trangchu";
    }
}
