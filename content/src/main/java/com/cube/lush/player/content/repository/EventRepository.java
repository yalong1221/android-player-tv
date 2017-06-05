package com.cube.lush.player.content.repository;

import android.support.annotation.NonNull;

import com.cube.lush.player.api.model.Event;
import com.cube.lush.player.content.handler.ResponseHandler;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Event respository to provide a list of all events
 *
 * @author Jamie Cruwys
 */
public class EventRepository extends Repository<Event>
{
	private EventRepository() { }

	public static final EventRepository INSTANCE = new EventRepository();

	@Override void getItemsFromNetwork(@NonNull final ResponseHandler<Event> callback)
	{
		Call<List<Event>> events = api.getEvents();

		events.enqueue(new Callback<List<Event>>()
		{
			@Override public void onResponse(Call<List<Event>> call, Response<List<Event>> response)
			{
				if (response != null && response.isSuccessful() && response.body() != null)
				{
					callback.onSuccess(response.body());
				}
			}

			@Override public void onFailure(Call<List<Event>> call, Throwable t)
			{
				callback.onFailure(t);
			}
		});
	}
}