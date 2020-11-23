package pe.azm.family_pet.ui.MascotasPerdidas;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.azm.family_pet.R;

public class MascotasPerdidas extends Fragment {

    private MascotasPerdidasViewModel mViewModel;

    public static MascotasPerdidas newInstance() {
        return new MascotasPerdidas();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mascotas_perdidas_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MascotasPerdidasViewModel.class);
        // TODO: Use the ViewModel
    }

}