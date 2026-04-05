package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f6476b;

    public v0(FragmentManager fragmentManager) {
        this.f6476b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        e2 e2VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f6476b;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4.a.f90376a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(s0.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentFindFragmentById = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                    if (fragmentFindFragmentById == null && string != null) {
                        fragmentFindFragmentById = fragmentManager.findFragmentByTag(string);
                    }
                    if (fragmentFindFragmentById == null && id2 != -1) {
                        fragmentFindFragmentById = fragmentManager.findFragmentById(id2);
                    }
                    if (fragmentFindFragmentById == null) {
                        fragmentFindFragmentById = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
                        fragmentFindFragmentById.mFromLayout = true;
                        fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragmentFindFragmentById.mContainerId = id2;
                        fragmentFindFragmentById.mTag = string;
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        fragmentFindFragmentById.mHost = fragmentManager.getHost();
                        fragmentFindFragmentById.onInflate(fragmentManager.getHost().f6461c, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        e2VarF = fragmentManager.a(fragmentFindFragmentById);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentFindFragmentById + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentFindFragmentById.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        fragmentFindFragmentById.mHost = fragmentManager.getHost();
                        fragmentFindFragmentById.onInflate(fragmentManager.getHost().f6461c, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        e2VarF = fragmentManager.f(fragmentFindFragmentById);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentFindFragmentById + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    x4.e.onFragmentTagUsage(fragmentFindFragmentById, viewGroup);
                    fragmentFindFragmentById.mContainer = viewGroup;
                    e2VarF.j();
                    e2VarF.i();
                    View view2 = fragmentFindFragmentById.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(a.b.l("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentFindFragmentById.mView.getTag() == null) {
                        fragmentFindFragmentById.mView.setTag(string);
                    }
                    fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new u0(this, e2VarF));
                    return fragmentFindFragmentById.mView;
                }
            }
        }
        return null;
    }
}
