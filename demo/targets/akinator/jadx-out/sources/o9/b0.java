package o9;

import com.digidust.elokence.akinator.activities.ConnectActivity;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConnectActivity f78041c;

    public /* synthetic */ b0(ConnectActivity connectActivity, int i10) {
        this.f78040b = i10;
        this.f78041c = connectActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f78040b;
        ConnectActivity connectActivity = this.f78041c;
        switch (i10) {
            case 0:
                int i11 = ConnectActivity.U;
                connectActivity.getClass();
                return Integer.valueOf(ca.m.sharedInstance().hasBeenForcedToDisconnect() ? ca.o.sharedInstance().loginUser(connectActivity.H.getText().toString(), ca.m.sharedInstance().getPasswordUser(), false) : ca.o.sharedInstance().loginUser(connectActivity.H.getText().toString(), connectActivity.I.getText().toString(), true));
            default:
                int i12 = ConnectActivity.U;
                connectActivity.getClass();
                return Integer.valueOf(ca.o.sharedInstance().resendActivationMail(connectActivity.H.getText().toString()));
        }
    }
}
