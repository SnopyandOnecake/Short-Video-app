// Generated by data binding compiler. Do not edit!
package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.model.Feed;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFeedDetailTypeImageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView actionClose;

  @NonNull
  public final LayoutFeedDetailAuthorInfoBinding authorInfoLayout;

  @NonNull
  public final LayoutFeedDetailBottomInateractionBinding interactionLayout;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView title;

  @NonNull
  public final FrameLayout titleLayout;

  @Bindable
  protected Feed mFeed;

  protected ActivityFeedDetailTypeImageBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView actionClose,
      LayoutFeedDetailAuthorInfoBinding authorInfoLayout,
      LayoutFeedDetailBottomInateractionBinding interactionLayout, RecyclerView recyclerView,
      TextView title, FrameLayout titleLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionClose = actionClose;
    this.authorInfoLayout = authorInfoLayout;
    setContainedBinding(this.authorInfoLayout);
    this.interactionLayout = interactionLayout;
    setContainedBinding(this.interactionLayout);
    this.recyclerView = recyclerView;
    this.title = title;
    this.titleLayout = titleLayout;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_feed_detail_type_image, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFeedDetailTypeImageBinding>inflateInternal(inflater, R.layout.activity_feed_detail_type_image, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_feed_detail_type_image, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFeedDetailTypeImageBinding>inflateInternal(inflater, R.layout.activity_feed_detail_type_image, null, false, component);
  }

  public static ActivityFeedDetailTypeImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityFeedDetailTypeImageBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityFeedDetailTypeImageBinding)bind(component, view, R.layout.activity_feed_detail_type_image);
  }
}
