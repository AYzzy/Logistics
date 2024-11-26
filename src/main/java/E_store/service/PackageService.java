package E_store.service;

import E_store.dtos.request.CreatePackageRequest;
import E_store.dtos.response.CreatePackageResponse;

public interface PackageService {
    CreatePackageResponse createPackage (CreatePackageRequest packageRequest);
}
