package com.sfbx.appconsentv3.ui.ui.vendor.refine;

import af.g;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3FragmentDisplayByVendorTabBinding;
import com.sfbx.appconsentv3.ui.listener.VendorListener;
import com.sfbx.appconsentv3.ui.model.Response;
import com.sfbx.appconsentv3.ui.ui.consentable.detail.a;
import com.sfbx.appconsentv3.ui.ui.vendor.VendorViewModel;
import com.sfbx.appconsentv3.ui.ui.vendor.detail.VendorDetailActivity;
import com.sfbx.appconsentv3.ui.viewmodel.ViewModelFactory;
import i.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.o;
import tu.q;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RefineByVendorTabFragment extends Fragment implements VendorListener, View.OnClickListener {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ID = "extra_id";
    private static final String EXTRA_STATUS = "extra_status";
    private static final String EXTRA_VENDOR = "extra_vendor";
    private AppconsentV3FragmentDisplayByVendorTabBinding _binding;
    private boolean isExtraVendor;
    private final d startForResult;
    private final o mViewModelFactory$delegate = q.lazy(RefineByVendorTabFragment$mViewModelFactory$2.INSTANCE);
    private final o mViewModel$delegate = s2.createViewModelLazy(this, c1.getOrCreateKotlinClass(VendorViewModel.class), new RefineByVendorTabFragment$special$$inlined$viewModels$default$2(new RefineByVendorTabFragment$special$$inlined$viewModels$default$1(this)), new RefineByVendorTabFragment$mViewModel$2(this));
    private List<Vendor> mVendors = p0.emptyList();
    private final VendorAdapter mVendorAdapter = new VendorAdapter();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Intent getResultIntent(int i10, ConsentStatus status) {
            e0.checkNotNullParameter(status, "status");
            Intent intent = new Intent();
            intent.putExtra(RefineByVendorTabFragment.EXTRA_ID, i10);
            intent.putExtra(RefineByVendorTabFragment.EXTRA_STATUS, status);
            return intent;
        }

        public final RefineByVendorTabFragment newInstance(boolean z10) {
            RefineByVendorTabFragment refineByVendorTabFragment = new RefineByVendorTabFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(RefineByVendorTabFragment.EXTRA_VENDOR, z10);
            refineByVendorTabFragment.setArguments(bundle);
            return refineByVendorTabFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorTabFragment$vendorStatusChanged$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ int $vendorId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10) {
            super(1);
            this.$vendorId = i10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Response<Boolean>) obj);
            return x0.f87415a;
        }

        public final void invoke(Response<Boolean> response) {
            if (response instanceof Response.Success) {
                RefineByVendorTabFragment refineByVendorTabFragment = RefineByVendorTabFragment.this;
                refineByVendorTabFragment.loadData(refineByVendorTabFragment.getMViewModel().getVendors(), RefineByVendorTabFragment.this.getMViewModel().getConsentables());
                return;
            }
            if (response instanceof Response.Error) {
                VendorAdapter vendorAdapter = RefineByVendorTabFragment.this.mVendorAdapter;
                List<Object> currentList = RefineByVendorTabFragment.this.mVendorAdapter.getCurrentList();
                e0.checkNotNullExpressionValue(currentList, "mVendorAdapter.currentList");
                int i10 = this.$vendorId;
                Iterator<Object> it = currentList.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (((Vendor) it.next()).getId() == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                vendorAdapter.notifyItemChanged(i11);
            }
        }
    }

    public RefineByVendorTabFragment() {
        d dVarRegisterForActivityResult = registerForActivityResult(new j.d(), new g(this, 17));
        e0.checkNotNullExpressionValue(dVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.startForResult = dVarRegisterForActivityResult;
    }

    private final AppconsentV3FragmentDisplayByVendorTabBinding getBinding() {
        AppconsentV3FragmentDisplayByVendorTabBinding appconsentV3FragmentDisplayByVendorTabBinding = this._binding;
        e0.checkNotNull(appconsentV3FragmentDisplayByVendorTabBinding);
        return appconsentV3FragmentDisplayByVendorTabBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VendorViewModel getMViewModel() {
        return (VendorViewModel) this.mViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewModelFactory getMViewModelFactory() {
        return (ViewModelFactory) this.mViewModelFactory$delegate.getValue();
    }

    public static final Intent getResultIntent(int i10, ConsentStatus consentStatus) {
        return Companion.getResultIntent(i10, consentStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(List<Vendor> list, List<Consentable> list2) {
        Object next;
        ArrayList<Vendor> arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.isExtraVendor == ((Vendor) obj).isExtraVendor()) {
                arrayList.add(obj);
            }
        }
        this.mVendors = arrayList;
        for (Vendor vendor : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                Consentable consentable = (Consentable) obj2;
                Iterator<T> it = consentable.getVendors().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((Vendor) next).getId() == vendor.getId()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Vendor vendor2 = (Vendor) next;
                if (vendor2 != null && !vendor2.isLegVendor() && (consentable.getType() == ConsentableType.PURPOSE || consentable.getType() == ConsentableType.EXTRA_PURPOSE || consentable.getType() == ConsentableType.SPECIAL_FEATURE)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                vendor.setStatus(ConsentStatus.UNDEFINED);
            }
        }
        this.mVendorAdapter.submitList(this.mVendors);
    }

    public static final RefineByVendorTabFragment newInstance(boolean z10) {
        return Companion.newInstance(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$2(RefineByVendorTabFragment this$0, ActivityResult activityResult) {
        e0.checkNotNullParameter(this$0, "this$0");
        int i10 = -1;
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            int i11 = 0;
            Object obj = null;
            Integer numValueOf = data != null ? Integer.valueOf(data.getIntExtra(EXTRA_ID, 0)) : null;
            Intent data2 = activityResult.getData();
            Serializable serializableExtra = data2 != null ? data2.getSerializableExtra(EXTRA_STATUS) : null;
            e0.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.sfbx.appconsent.core.model.ConsentStatus");
            ConsentStatus consentStatus = (ConsentStatus) serializableExtra;
            Iterator<T> it = this$0.mVendors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int id2 = ((Vendor) next).getId();
                if (numValueOf != null && id2 == numValueOf.intValue()) {
                    obj = next;
                    break;
                }
            }
            Vendor vendor = (Vendor) obj;
            if (vendor != null) {
                vendor.setStatus(consentStatus);
            }
            VendorAdapter vendorAdapter = this$0.mVendorAdapter;
            List<Object> currentList = vendorAdapter.getCurrentList();
            e0.checkNotNullExpressionValue(currentList, "mVendorAdapter.currentList");
            Iterator<Object> it2 = currentList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int id3 = ((Vendor) it2.next()).getId();
                if (numValueOf != null && id3 == numValueOf.intValue()) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            vendorAdapter.notifyItemChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vendorStatusChanged$lambda$9(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object next;
        Iterator<T> it = this.mVendors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Vendor vendor = (Vendor) next;
            if (view != null) {
                int id2 = vendor.getId();
                Object tag = view.getTag();
                if ((tag instanceof Integer) && id2 == ((Number) tag).intValue()) {
                    break;
                }
            }
        }
        Vendor vendor2 = (Vendor) next;
        if (vendor2 != null) {
            d dVar = this.startForResult;
            VendorDetailActivity.Companion companion = VendorDetailActivity.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            dVar.launch(companion.getStartIntent(fragmentActivityRequireActivity, vendor2.getId(), vendor2.getStatus()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        this._binding = AppconsentV3FragmentDisplayByVendorTabBinding.inflate(inflater, viewGroup, false);
        RelativeLayout root = getBinding().getRoot();
        e0.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.isExtraVendor = arguments != null ? arguments.getBoolean(EXTRA_VENDOR) : false;
        VendorAdapter vendorAdapter = this.mVendorAdapter;
        vendorAdapter.setLearnMoreListener(this);
        vendorAdapter.setVendorListener(this);
        RecyclerView recyclerView = getBinding().recyclerVendors;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.mVendorAdapter);
        loadData(getMViewModel().getVendors(), getMViewModel().getConsentables());
    }

    @Override // com.sfbx.appconsentv3.ui.listener.VendorListener
    public void vendorStatusChanged(int i10, int i11, ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        getMViewModel().setVendorStatus(i11, newStatus).observe(getViewLifecycleOwner(), new a(18, new AnonymousClass1(i11)));
    }
}
