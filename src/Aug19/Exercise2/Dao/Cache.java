package Aug19.Exercise2.Dao;



import Aug19.Exercise2.Entity.Student;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<Long, Student> map  =new HashMap<>();


    public void addToCache(Student u){
        if(!map.containsKey(u.getId())){
            System.out.println("User with id ="+u.getId()+" adding to cache");
            map.put(u.getId(),u) ;
        }
    }

    public Student getFromCache(Long id){
        Student user=null;
        if (map.containsKey(id)){
            System.out.println("Fetching user with id "+id+" from cache");
            user=map.get(id);
            return user;
        }
        else{

        }
        return user;
    }

    public boolean isPresent(Long id){
        if(map.containsKey(id)){
            return true;
        }
        return false;
    }
}
