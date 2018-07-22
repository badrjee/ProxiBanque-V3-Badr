//package fr.gtm.projetv3.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//
//
//public abstract class CrudService<ENTITY extends Entity> {
//	
//	@Autowired
//	protected JpaRepository<ENTITY, Integer> repo;
//
//	
//	public ENTITY save(ENTITY entity) {
//		return this.repo.save(entity);
//	}
//
//	
//	public ENTITY create(ENTITY entity) {
//		return this.save(entity);
//	}
//
//	
//	public List<ENTITY> getList() {
//		return this.repo.findAll();
//	}
//
//	public ENTITY read(Integer id) {
//		ENTITY result = null;
//		final Optional<ENTITY> wrapper = this.repo.findById(id);
//		if (wrapper.isPresent()) {
//			result = wrapper.get();
//		}
//		return result;
//	}
//
//	
//	public void delete(Integer id) {
//		this.repo.deleteById(id);
//	}
//
//	
//	public ENTITY edit(ENTITY entity) {
//		if (entity.getId() == null) {
//			throw new IllegalArgumentException(
//					"Cannot update an article without its id.");
//		}
//		return this.save(entity);
//	}
//
//
//}
