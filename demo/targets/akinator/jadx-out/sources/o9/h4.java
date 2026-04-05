package o9;

import com.digidust.elokence.akinator.activities.PartageVideoActivity;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h4 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f78190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PartageVideoActivity f78191b;

    public h4(PartageVideoActivity partageVideoActivity, File file) {
        this.f78191b = partageVideoActivity;
        this.f78190a = file;
    }

    @Override // da.g
    public void onCloseConfirme() {
        this.f78190a.delete();
        this.f78191b.finish();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
