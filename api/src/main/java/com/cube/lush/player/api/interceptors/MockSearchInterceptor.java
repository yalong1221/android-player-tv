package com.cube.lush.player.api.interceptors;

import android.content.Context;
import android.support.annotation.NonNull;

import com.cube.lush.player.api.interceptors.base.BaseMockInterceptor;

/**
 * Created by Jamie Cruwys of 3 SIDED CUBE on 29/03/2017.
 */
public class MockSearchInterceptor extends BaseMockInterceptor
{
	public MockSearchInterceptor(@NonNull Context context)
	{
		super(context);
	}

	@Override protected String provideEndpointName()
	{
		return "search";
	}

	@Override protected String provideJsonFileName()
	{
		return "mock/api/search.json";
	}
}