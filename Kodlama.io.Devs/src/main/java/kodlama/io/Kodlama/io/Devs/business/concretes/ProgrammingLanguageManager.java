package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service // bu sınıf business nesnesidir.
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	// (Autowired) git parametrelerine bak demek anlamına geliyor.
	// Uygulama içinde bunu implement ediyorsa onun newlenmiş halini bana ver demek
	// yazılmasa da autowired çalışıyor. oluyor.

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// iş kuralları burada yazılır.
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage programmingLanguages : this.programmingLanguageRepository.getAll()) {
			if (programmingLanguage.getName() == programmingLanguages.getName()) {
				throw new Exception("Kurs mevcut!");
			} else if (programmingLanguage.getName() == null) {
				throw new Exception("İsim boş geçilemez!");
			}
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage programmingLanguages : this.programmingLanguageRepository.getAll()) {
			if (programmingLanguage.getName() == programmingLanguages.getName()) {
				throw new Exception("Kurs mevcut!");
			} else if (programmingLanguage.getName() == null) {
				throw new Exception("İsim boş geçilemez!");
			}
		}
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage getOneById(int id) {
		return programmingLanguageRepository.getOneById(id);
	}

}
