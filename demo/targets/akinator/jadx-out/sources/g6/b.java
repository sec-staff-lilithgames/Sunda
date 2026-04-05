package g6;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static <T extends i> T fromInputStream(InputStream inputStream) {
        return (T) new h(inputStream, null).j();
    }

    public static <T extends i> T fromParcelable(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).getVersionedParcel();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends i> T getVersionedParcelable(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(b.class.getClassLoader());
            return (T) fromParcelable(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static <T extends i> List<T> getVersionedParcelableList(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(b.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(fromParcelable((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void putVersionedParcelable(Bundle bundle, String str, i iVar) {
        if (iVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", toParcelable(iVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void putVersionedParcelableList(Bundle bundle, String str, List<? extends i> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toParcelable(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static void toOutputStream(i iVar, OutputStream outputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        h hVar = new h(null, outputStream);
        hVar.o(iVar);
        hVar.closeField();
    }

    public static Parcelable toParcelable(i iVar) {
        return new ParcelImpl(iVar);
    }
}
