package com.example.shoppinglist.di

import android.app.Application
import androidx.room.Room
import com.example.shoppinglist.data.AddItemRepoImpl
import com.example.shoppinglist.data.AddItemRepository
import com.example.shoppinglist.data.MainDb
import com.example.shoppinglist.data.NoteRepoImpl
import com.example.shoppinglist.data.NoteRepository
import com.example.shoppinglist.data.ShoppingListRepoImpl
import com.example.shoppinglist.data.ShoppingListRepository
import com.example.shoppinglist.datastore.DataStoreManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDb(app: Application): MainDb{
        return Room.databaseBuilder(app, MainDb::class.java,"shop_list_db").build()
    }

    @Provides
    @Singleton
    fun provideShopRepo(db: MainDb): ShoppingListRepository{
        return ShoppingListRepoImpl(db.shoppingListDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepo(db: MainDb): AddItemRepository{
        return AddItemRepoImpl(db.addItemDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db: MainDb): NoteRepository{
        return NoteRepoImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideDataStoreManager(app: Application): DataStoreManager{
        return DataStoreManager(app)
    }
}