package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    GridView gridView;
    ArrayList<Categories> arrayList;
    FurnitureAdapterGrid furnitureAdapterGrid;

    public DashboardFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DashboardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();

        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.gridView);
        arrayList = getMockData();
        furnitureAdapterGrid = new FurnitureAdapterGrid(getContext(),arrayList);
        gridView.setAdapter(furnitureAdapterGrid);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
    public ArrayList<Categories> getMockData(){
        ArrayList<Furniture> arrayListBed = new ArrayList<>();
        ArrayList<Furniture> arrayListLiving = new ArrayList<>();
        ArrayList<Furniture> arrayListMeeting = new ArrayList<>();
        ArrayList<Furniture> arrayListAccessories = new ArrayList<>();
        ArrayList<Categories> tmp = new ArrayList<>();
        tmp.add(new Categories("BedRoom", arrayListBed,
                Categories.convertStringToBitmapFromAccess(getContext(), "bed_room.png")));
        tmp.add(new Categories("LivingRoom", arrayListLiving,
                Categories.convertStringToBitmapFromAccess(getContext(), "living_room.png")));
        tmp.add(new Categories("MeetingRoom", arrayListMeeting,
                Categories.convertStringToBitmapFromAccess(getContext(), "meeting_room.png")));
        tmp.add(new Categories("Accessories", arrayListAccessories,
                Categories.convertStringToBitmapFromAccess(getContext(), "accessories.png")));
        return tmp;
    }
}