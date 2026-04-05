package s9;

import android.graphics.Bitmap;
import android.widget.Toast;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddPhotoBinding;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f85508c;

    public /* synthetic */ b(c cVar, int i10) {
        this.f85507b = i10;
        this.f85508c = cVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f85507b) {
            case 0:
                c cVar = this.f85508c;
                FragmentAddPhotoBinding fragmentAddPhotoBinding = cVar.f85510c;
                e0.checkNotNull(fragmentAddPhotoBinding);
                fragmentAddPhotoBinding.loadingBarAward.setVisibility(8);
                FragmentAddPhotoBinding fragmentAddPhotoBinding2 = cVar.f85510c;
                e0.checkNotNull(fragmentAddPhotoBinding2);
                fragmentAddPhotoBinding2.proposalImage.setImageBitmap((Bitmap) obj);
                break;
            default:
                c cVar2 = this.f85508c;
                FragmentAddPhotoBinding fragmentAddPhotoBinding3 = cVar2.f85510c;
                e0.checkNotNull(fragmentAddPhotoBinding3);
                fragmentAddPhotoBinding3.loadingBarAward.setVisibility(8);
                FragmentAddPhotoBinding fragmentAddPhotoBinding4 = cVar2.f85510c;
                e0.checkNotNull(fragmentAddPhotoBinding4);
                fragmentAddPhotoBinding4.proposalImage.setBackgroundColor(-16777216);
                Toast.makeText(cVar2.requireContext(), ((Throwable) obj).getMessage(), 0).show();
                break;
        }
        return x0.f87415a;
    }
}
