package com.cube.lush.player.api.interceptors;

import android.content.Context;
import android.support.annotation.NonNull;

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
		return "programme-search/";
	}

	@Override protected String provideJsonFileName()
	{
		return "mock/api/programmes.json";
	}
}
