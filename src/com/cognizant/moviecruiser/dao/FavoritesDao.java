/**
 * 
 */
package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.model.Movie;

/**
 * @author Naveen
 *
 */
public interface FavoritesDao {
	public void addFavorites(long userId, long movieId);

	
	public void removeFavorites(long userId, long movieId);

	List<Movie> getAllFavorites(long userid) throws FavoritesEmptyException;
}
