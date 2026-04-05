package in;

import android.os.Bundle;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import me.q;
import me.v;
import mh.v0;
import nh.b5;
import nh.sd;
import nh.ze;
import on.x;
import tn.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59795b;

    public /* synthetic */ c(int i10) {
        this.f59795b = i10;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        switch (this.f59795b) {
            case 0:
                return b.fromBundle((Bundle) obj);
            case 1:
                return ((b) obj).toBinderBasedBundle();
            case 2:
                return new x((io.bidmachine.media3.common.util.g) obj);
            case 3:
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                int i10 = aVar.f60865a;
                int i11 = aVar.f60866b;
                int i12 = aVar.f60868d;
                return new StreamVolumeManager.a(i10, i11 > i12 ? i11 - 1 : i12, i11 <= 1, i12, aVar.f60869e);
            case 4:
                StreamVolumeManager.a aVar2 = (StreamVolumeManager.a) obj;
                int i13 = aVar2.f60865a;
                int i14 = aVar2.f60866b;
                int i15 = aVar2.f60869e;
                return new StreamVolumeManager.a(i13, i14 < i15 ? i14 + 1 : i15, false, aVar2.f60868d, i15);
            case 5:
                return (StreamVolumeManager.a) obj;
            case 6:
                v vVar = (v) obj;
                int i16 = q.f74433y;
                return vVar;
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                return ((ze) obj).f76827b;
            case 9:
                return ((ze) obj).f76828c;
            case 10:
                return sd.a((Collection) obj);
            case 11:
                Pattern pattern = pn.f.D;
                return b5.of(Integer.valueOf(((co.j) obj).f12428b));
            case 12:
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 13:
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            case 14:
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            default:
                return ((r) obj).getTrackGroups().getTrackTypes();
        }
    }
}
