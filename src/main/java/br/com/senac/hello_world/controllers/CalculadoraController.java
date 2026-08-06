package br.com.senac.hello_world.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar")
    public ResponseEntity<Integer> somar(
            @RequestParam int numero1,
            @RequestParam int numero2
    ) {
        return ResponseEntity.ok(numero1 + numero2);
    }

    @GetMapping("/subtrair")
    public ResponseEntity<Integer> subtrair(
            @RequestParam int numero1,
            @RequestParam int numero2
    ) {
        return ResponseEntity.ok(numero1 - numero2);
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<Integer> multiplicar(
            @RequestParam int numero1,
            @RequestParam int numero2
    ) {
        return ResponseEntity.ok(numero1 * numero2);
    }

    @GetMapping("/dividir")
    public ResponseEntity<Double> dividir(
            @RequestParam double numero1,
            @RequestParam double numero2
    ) {

        return ResponseEntity.ok(numero1 / numero2);
    }
}
