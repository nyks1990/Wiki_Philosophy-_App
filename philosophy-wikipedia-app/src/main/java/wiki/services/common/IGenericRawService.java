package wiki.services.common;

import java.io.Serializable;

import wiki.models.common.contracts.ICrudOperations;

public interface IGenericRawService<T extends Serializable, ID extends Serializable> extends ICrudOperations<T, ID> {
}
