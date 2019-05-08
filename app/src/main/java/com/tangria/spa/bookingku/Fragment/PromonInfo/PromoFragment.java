package com.tangria.spa.bookingku.Fragment.PromonInfo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.tangria.spa.bookingku.Fragment.Base.BaseFragment;
import com.tangria.spa.bookingku.Fragment.Home.MainSliderAdapter;
import com.tangria.spa.bookingku.Fragment.Home.PicassoImageLoadingService;
import com.tangria.spa.bookingku.Network.BookingClient;
import com.tangria.spa.bookingku.Network.BookingService;
import com.tangria.spa.bookingku.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ss.com.bannerslider.Slider;

import java.util.ArrayList;

public class PromoFragment extends BaseFragment {
//    ArrayList<Gambar> arrayku;
//    public RecyclerView recycler_view_list_film;
//    public ArrayList<Time> listFilm = new ArrayList<>();
//    public SectionListDataAdapter adapterAllTipe;
//    private Slider slider;
//    private ShimmerFrameLayout mShimmerViewContainer;

    private MaterialBetterSpinner spinner;

    @Override
    protected int getLayout() {
        return R.layout.promoninfo;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
