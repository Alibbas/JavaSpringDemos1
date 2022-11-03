package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.*;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void update(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage getOneById(int id);

}
