package repository;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByLocationContainingOrTitleContaining(String location, String title);
}
