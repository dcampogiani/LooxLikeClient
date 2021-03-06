package com.disorder.looxlike.application.di.components;

import android.content.Context;

import com.disorder.looxlike.application.di.PerActivity;
import com.disorder.looxlike.application.di.modules.PresentationModule;
import com.disorder.looxlike.fragments.CheckFragmentOrder;
import com.disorder.looxlike.fragments.CreatePostFragment;
import com.disorder.looxlike.fragments.ItemSelectionFragment;
import com.disorder.looxlike.fragments.LikedPostFragment;
import com.disorder.looxlike.fragments.NewsFragment;
import com.disorder.looxlike.fragments.ToolbarFragment;
import com.disorder.networking.services.LooxLikeAPI;
import com.disorder.presentation.model.mapper.NewsPostMapper;
import com.disorder.presentation.presenter.ToolbarPresenter;
import com.disorder.presentation.presenter.creation.ItemSelectionPresenter;
import com.disorder.presentation.presenter.creation.OrderCheckPresenter;
import com.disorder.presentation.presenter.news.LikedPostPresenter;
import com.disorder.presentation.utils.Browser;
import com.disorder.presentation.utils.ImageUrlGenerator;
import com.disorder.presentation.utils.ItemPageUrlEvaluator;
import com.disorder.presentation.utils.RxScheduler;
import com.disorder.presentation.utils.UserAvatarUrlGenerator;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = PresentationModule.class)
public interface PresentationComponent {

    void inject(ToolbarFragment toolbarFragment);

    void inject(NewsFragment newsFragment);

    void inject(CheckFragmentOrder checkOrderFragment);

    void inject(ItemSelectionFragment itemSelectionFragment);

    void inject(CreatePostFragment createPostFragment);

    void inject(LikedPostFragment likedPostFragment);

    Context context();

    ToolbarPresenter homePresenter();

    LooxLikeAPI looxLikeAPI();

    RxScheduler rxScheduler();

    NewsPostMapper newsPostMapper();

    ItemPageUrlEvaluator itemPageUrlEvaluator();

    Browser browser();

    OrderCheckPresenter orderCheckPresenter();

    ImageUrlGenerator imageUrlGenerator();

    ItemSelectionPresenter itemSelectionPresenter();

    UserAvatarUrlGenerator userAvatartUrlGenerator();

    LikedPostPresenter likedPostPresenter();
}
