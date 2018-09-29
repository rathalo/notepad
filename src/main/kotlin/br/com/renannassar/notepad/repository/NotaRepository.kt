package br.com.renannassar.notepad.repository

import br.com.renannassar.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository:MongoRepository<Nota, String>{

    fun findByTituloContaining(titulo: String):List<Nota>

}