package b1;

import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f8600c;

    public /* synthetic */ e0(int i10, Collection collection) {
        this.f8599b = i10;
        this.f8600c = collection;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i10 = this.f8599b;
        Collection<?> collection = this.f8600c;
        switch (i10) {
            case 0:
                Parcelable.Creator<SnapshotStateList<Object>> creator = SnapshotStateList.CREATOR;
                zRetainAll = ((List) obj).retainAll(collection);
                break;
            case 1:
                Parcelable.Creator<SnapshotStateSet<Object>> creator2 = SnapshotStateSet.CREATOR;
                zRetainAll = ((Set) obj).retainAll(uu.y0.toSet(collection));
                break;
            case 2:
                zRetainAll = collection.contains(obj);
                break;
            case 3:
                int i11 = t0.b.f86219b;
                zRetainAll = !collection.contains(obj);
                break;
            case 4:
                int i12 = t0.b.f86219b;
                zRetainAll = collection.contains(obj);
                break;
            default:
                int i13 = t0.f.f86226k;
                zRetainAll = collection.contains(obj);
                break;
        }
        return Boolean.valueOf(zRetainAll);
    }
}
