package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.*;


import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage getOneById(int id);

}
