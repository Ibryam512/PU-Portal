package com.example.puportal.ui.grades;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.puportal.R;
import com.example.puportal.databinding.FragmentGradesBinding;

import java.util.ArrayList;
import java.util.List;

public class GradesFragment extends Fragment {

    private FragmentGradesBinding binding;

    private final List<CardView> cards = new ArrayList<>();
    private final List<LinearLayout> expandableCards = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GradesViewModel gradesViewModel =
                new ViewModelProvider(this).get(GradesViewModel.class);

        binding = FragmentGradesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        cards.add(root.findViewById(R.id.cardGrade1));
        cards.add(root.findViewById(R.id.cardGrade2));
        cards.add(root.findViewById(R.id.cardGrade3));
        cards.add(root.findViewById(R.id.cardGrade4));
        cards.add(root.findViewById(R.id.cardGrade5));
        cards.add(root.findViewById(R.id.cardGrade6));
        cards.add(root.findViewById(R.id.cardGrade7));
        cards.add(root.findViewById(R.id.cardGrade8));
        cards.add(root.findViewById(R.id.cardGrade9));
        cards.add(root.findViewById(R.id.cardGrade10));

        expandableCards.add(root.findViewById(R.id.expandableCard1));
        expandableCards.add(root.findViewById(R.id.expandableCard2));
        expandableCards.add(root.findViewById(R.id.expandableCard3));
        expandableCards.add(root.findViewById(R.id.expandableCard4));
        expandableCards.add(root.findViewById(R.id.expandableCard5));
        expandableCards.add(root.findViewById(R.id.expandableCard6));
        expandableCards.add(root.findViewById(R.id.expandableCard7));
        expandableCards.add(root.findViewById(R.id.expandableCard8));
        expandableCards.add(root.findViewById(R.id.expandableCard9));
        expandableCards.add(root.findViewById(R.id.expandableCard10));


        for (int i = 0; i < cards.size(); i++) {
            int finalI = i;

            cards.get(i).setOnClickListener(v -> {
                if (expandableCards.get(finalI).getVisibility() == View.GONE) {
                    expandableCards.get(finalI).setVisibility(View.VISIBLE);
                } else {
                    expandableCards.get(finalI).setVisibility(View.GONE);
                }
            });
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}