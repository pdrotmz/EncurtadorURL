package dev.pdrotmz.EncurtadorURL.Repository;

import dev.pdrotmz.EncurtadorURL.Model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Integer> {

    // Query Personalizada
    Link findByUrlOriginal(String urlEncurtada);

}
