package l6;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static b0 f72441b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f72442a;

    public b0(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f72442a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f72441b == null) {
            f72441b = new b0(w0.getFactory().getProfileStore());
        }
        return f72441b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) throws IllegalStateException {
        if (t0.E.isSupportedByWebView()) {
            return this.f72442a.deleteProfile(str);
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public List<String> getAllProfileNames() {
        if (t0.E.isSupportedByWebView()) {
            return this.f72442a.getAllProfileNames();
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public k6.b getOrCreateProfile(String str) {
        if (t0.E.isSupportedByWebView()) {
            return new a0((ProfileBoundaryInterface) rw.a.castToSuppLibClass(ProfileBoundaryInterface.class, this.f72442a.getOrCreateProfile(str)));
        }
        throw t0.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public k6.b getProfile(String str) {
        if (!t0.E.isSupportedByWebView()) {
            throw t0.getUnsupportedOperationException();
        }
        InvocationHandler profile = this.f72442a.getProfile(str);
        if (profile != null) {
            return new a0((ProfileBoundaryInterface) rw.a.castToSuppLibClass(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
