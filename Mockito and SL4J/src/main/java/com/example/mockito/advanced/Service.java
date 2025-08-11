
package com.example.mockito.advanced;

public class Service {
    private final Repository repo;
    public Service(Repository repo) { this.repo = repo; }
    public String processData() { return "Processed " + repo.getData(); }
}
