package ih;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.c0;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f59579a;

    public b(f fVar) {
        this.f59579a = fVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) c0.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        o2.z(iIntValue, "addAssetPath completed with ", "SplitCompat");
        return iIntValue;
    }

    public final synchronized void zza(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzc(assets, (File) it.next());
        }
    }
}
