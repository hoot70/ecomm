package ecomm.example.ecomm.Controller;


import ecomm.example.ecomm.Model.ChargeRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckoutController {

    @Value("${STRIPE_API_KEY}")
    private String stripePublicKey;

    @PostMapping("/checkout")
    public String checkout(@RequestParam double total, Model model) {
        model.addAttribute("amount", (long) total * 100); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        model.addAttribute("currency", ChargeRequest.Currency.USD);
        return "checkout";
    }

}
