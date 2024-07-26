package dev.pdrotmz.EncurtadorURL.Repository;

import dev.pdrotmz.EncurtadorURL.Model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    // Query Personalizada
    Link findByUrlEncurtada(String urlEncurtada);
}
