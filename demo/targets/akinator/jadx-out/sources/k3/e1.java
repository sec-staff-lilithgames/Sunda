package k3;

import android.app.RemoteInput;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {
    public static RemoteInput fromCompat(g1 g1Var) {
        Set<String> allowedDataTypes;
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(g1Var.getResultKey()).setLabel(g1Var.getLabel()).setChoices(g1Var.getChoices()).setAllowFreeFormInput(g1Var.getAllowFreeFormInput()).addExtras(g1Var.getExtras());
        if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = g1Var.getAllowedDataTypes()) != null) {
            Iterator<String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.j0.n0(builderAddExtras, it.next());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            com.google.firebase.messaging.b0.y(builderAddExtras, g1Var.getEditChoicesBeforeSending());
        }
        return builderAddExtras.build();
    }
}
