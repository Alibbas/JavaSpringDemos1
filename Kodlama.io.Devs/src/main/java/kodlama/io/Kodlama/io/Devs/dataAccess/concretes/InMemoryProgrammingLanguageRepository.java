package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>(); // arraylist somut
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(4, "C#"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage){
		programmingLanguage.setName(programmingLanguage.getName());
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
		
	}

	@Override
	public ProgrammingLanguage getOneById(int id) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguages)
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
			
			return null;
	}

}
