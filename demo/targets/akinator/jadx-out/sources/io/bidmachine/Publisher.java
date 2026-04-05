package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class Publisher {
    private final List<String> categories;
    private final String domain;

    /* renamed from: id, reason: collision with root package name */
    private final String f59829id;
    private final String name;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private List<String> categories;
        private String domain;

        /* renamed from: id, reason: collision with root package name */
        private String f59830id;
        private String name;

        public Builder addCategories(List<String> list) {
            if (!nm.j.isEmpty(list)) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    addCategory(it.next());
                }
            }
            return this;
        }

        public Builder addCategory(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (this.categories == null) {
                this.categories = new ArrayList();
            }
            this.categories.add(str);
            return this;
        }

        public Publisher build() {
            return new Publisher(this.f59830id, this.name, this.domain, this.categories);
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder setId(String str) {
            this.f59830id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }
    }

    public void build(Context.App.Builder builder) {
        Context.App.Publisher.Builder builderNewBuilder = Context.App.Publisher.newBuilder();
        String str = this.f59829id;
        if (str != null) {
            builderNewBuilder.setId(str);
        }
        String str2 = this.name;
        if (str2 != null) {
            builderNewBuilder.setName(str2);
        }
        String str3 = this.domain;
        if (str3 != null) {
            builderNewBuilder.setDomain(str3);
        }
        List<String> list = this.categories;
        if (list != null) {
            builderNewBuilder.addAllCat(list);
        }
        builder.setPub(builderNewBuilder.build());
    }

    private Publisher(String str, String str2, String str3, List<String> list) {
        this.f59829id = str;
        this.name = str2;
        this.domain = str3;
        this.categories = list;
    }
}
