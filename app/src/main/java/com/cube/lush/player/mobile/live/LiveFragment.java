package com.cube.lush.player.mobile.live;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cube.lush.player.R;

import butterknife.ButterKnife;
import uk.co.jamiecruwys.StatefulFragment;

public class LiveFragment extends StatefulFragment
{
	public LiveFragment()
	{
		// Required empty public constructor
	}

	public static LiveFragment newInstance()
	{
		LiveFragment fragment = new LiveFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	@Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = super.onCreateView(inflater, container, savedInstanceState);
		ButterKnife.bind(this, view);
		return view;
	}

	@Override public int provideLoadingLayout()
	{
		return R.layout.mobile_loading;
	}

	@Override public int provideEmptyLayout()
	{
		return R.layout.mobile_live_empty;
	}

	@Override public int provideLoadedLayout()
	{
		return R.layout.mobile_fragment_live;
	}

	@Override public int provideErrorLayout()
	{
		return R.layout.mobile_error;
	}
}