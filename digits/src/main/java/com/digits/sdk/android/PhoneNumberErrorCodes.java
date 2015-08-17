/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.digits.sdk.android;

import android.content.res.Resources;

import com.twitter.sdk.android.core.TwitterApiErrorConstants;

class PhoneNumberErrorCodes extends DigitsErrorCodes {

    PhoneNumberErrorCodes(Resources resources) {
        super(resources);
        codeIdMap.put(TwitterApiErrorConstants.DEVICE_REGISTRATION_INVALID_INPUT,
                R.string.dgts__try_again_phone_number);
        codeIdMap.put(TwitterApiErrorConstants.REGISTRATION_INVALID_INPUT,
                R.string.dgts__try_again_phone_number);
        codeIdMap.put(TwitterApiErrorConstants.REGISTRATION_PHONE_NORMALIZATION_FAILED,
                R.string.dgts__try_again_phone_number);
        codeIdMap.put(TwitterApiErrorConstants.DEVICE_ALREADY_REGISTERED,
                R.string.dgts__confirmation_error_alternative);
        codeIdMap.put(TwitterApiErrorConstants.OPERATOR_UNSUPPORTED,
                R.string.dgts__unsupported_operator_error);
    }
}
