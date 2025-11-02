package edu.icet.repository;


import edu.icet.model.entity.ViewOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewOrderRepository extends JpaRepository<ViewOrderEntity,String> {
}
