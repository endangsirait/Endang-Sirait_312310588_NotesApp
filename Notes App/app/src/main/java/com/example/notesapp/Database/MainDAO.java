package com.example.notesapp.Database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.notesapp.Model.Notes;

import java.util.List;

@Dao
public interface MainDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Notes notes);
    @Query("SELECT * FROM notes ORDER BY id DeSC")
    List<Notes> getAll();

    @Query("UPDATE notes SET tittle = :tittle,note = :notes WHERE ID = :id")
    void update(int id,String tittle,String notes);

    @Delete
    void delete(Notes note);

}
