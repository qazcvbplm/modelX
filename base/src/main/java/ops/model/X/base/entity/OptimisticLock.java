package ops.model.X.base.entity;

public interface OptimisticLock {

    void setVersion(Integer version);

    Integer getVersion();
}
