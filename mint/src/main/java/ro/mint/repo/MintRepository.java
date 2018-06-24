package ro.mint.repo;

public interface MintRepository<T extends Object> {
    public void save(T entity);

}