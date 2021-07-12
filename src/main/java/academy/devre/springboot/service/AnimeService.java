 package academy.devre.springboot.service;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import academy.devre.springboot.domain.Anime;

@Service
public class AnimeService {
	private List<Anime> animes = List.of(new Anime("CDZ", 1L), new Anime("Slime", 2L));
	
	public List<Anime> listAll(){
		return animes;
	}
	
	// GET for ID
	public Anime findById(long id){
		return animes.stream()
						.filter(anime -> anime.getId().equals(id))
						.findFirst()
						//not found id, return bad request
						.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
	}
}
