package br.com.renannassar.notepad.controller

import br.com.renannassar.notepad.model.Nota
import br.com.renannassar.notepad.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nota")


class NotaController{

   @Autowired
   lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkHealth(): String{
        return "OK"
    }

    @GetMapping
    fun buscarTodos():List<Nota>{
        return notaService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody nota:Nota):Nota{
        return notaService.salvar(nota)
    }

    @DeleteMapping("/{id}")
    fun apagar(@PathVariable("id") id: String){
        notaService.apagar(id)
    }

    @GetMapping("/titulo/{titulo}")
    fun buscarPorTitulo(@PathVariable("titulo")titulo:String):List<Nota>{
        return notaService.buscarPorTitulo(titulo)
    }

}