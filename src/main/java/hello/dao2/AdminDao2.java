package hello.dao2;


import hello.entity.AdminDo;

public interface AdminDao2 {
    AdminDo find(String userName);
    void insert(AdminDo adminDo);
}
