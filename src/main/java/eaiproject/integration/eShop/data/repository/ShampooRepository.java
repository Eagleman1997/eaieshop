package eaiproject.integration.eShop.data.repository;

import eaiproject.integration.eShop.data.domain.Shampoo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Search for a special Shampoo with the id
 * @param shampooId
 * @author Lukas Weber
 */
@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Integer>{

	public List<Shampoo> findShampoosByShampooId(@Param("shampooId") Integer ShampooId);
}