/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaee06;

import bean.DosenWali;
import bean.Mahasiswa;
import bean.Parkir;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.omg.CORBA.TRANSACTION_MODE;

/**
 *
 * @author praktek
 */
public class JavaEE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Session session = NewHibernateUtil.getSessionFactory().openSession();
      
        List<DosenWali> dosenWalis = session.createQuery("from DosenWali").list();
        
        for (DosenWali dosenwali : dosenWalis) {
       System.out.println("Nama Dosen "+dosenwali.getNama());
      Set<Mahasiswa> mahasiswas = dosenwali.getMahasiswas();
      
      for (Mahasiswa mahasiswa: mahasiswas) {
            System.out.println("Nama Mhs "+mahasiswa.getNama());
              
          }
        }
        
        List<Mahasiswa> mahasiswas = session.createQuery("from Mahasiswa").list();
          for (Mahasiswa mahasiswa: mahasiswas) {
            System.out.println("Nama Mhas "+mahasiswa.getNama());
            
           
            System.out.println("Nama Dosen "+mahasiswa.getDosenWali().getNama());
      
              
          }
         List<Object[]>  objects = session.createQuery("from Mahasiswa m, Parkir p "
         + " where m.nim = p.nim ").list();
         
         for (Object[] object : objects) {
            System.out.println("o 1 "+((Mahasiswa)object[0]).getNama());
            
           
            System.out.println("o 2 "+((Parkir)object[1]).getPlatNomer());
      
              
          }
        Transaction transaction = session.getTransaction();
        transaction.begin();
        DosenWali dosenWali = new DosenWali();
        dosenWali.setNik("013");
        dosenWali.setNama("Surorso");
        dosenWali.setAlamat("jln sd inpres");
        
        session.save(dosenWali);
        transaction.commit();
        
    }
    
}
