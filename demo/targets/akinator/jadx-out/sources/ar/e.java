package ar;

import android.view.View;
import android.view.ViewGroup;
import br.h0;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e extends Serializable {
    void destroy(Runnable runnable);

    void onClicked();

    void onError(h0 h0Var);

    void onShown();

    void onViewAddedToContainer(View view, ViewGroup viewGroup);

    void onViewCreated(View view);

    void onViewReady(View view);
}
