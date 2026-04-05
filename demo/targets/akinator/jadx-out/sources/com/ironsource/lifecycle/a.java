package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37181b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0233a f37182a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0233a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f37181b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f37181b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f37181b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0233a interfaceC0233a) {
        if (interfaceC0233a != null) {
            interfaceC0233a.a(getActivity());
        }
    }

    public void d(InterfaceC0233a interfaceC0233a) {
        this.f37182a = interfaceC0233a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f37182a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f37182a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f37182a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f37182a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0233a interfaceC0233a) {
        if (interfaceC0233a != null) {
            interfaceC0233a.b(getActivity());
        }
    }

    private void b(InterfaceC0233a interfaceC0233a) {
        if (interfaceC0233a != null) {
            interfaceC0233a.onResume(getActivity());
        }
    }
}
