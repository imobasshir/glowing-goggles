package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.Datasource
import com.example.myapplication.model.Affirmation
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AffirmationApp() {
    MyApplicationTheme {
        AffirmationList(affirmationList = Datasource().loadAffirmations())
    }
}


@Composable
fun AffirmationList(affirmationList: List<Affirmation>) {
    LazyColumn {
        items(affirmationList) { affirmation ->
            AffirmationCard(affirmation)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AffirmationCard(affirmation: Affirmation) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(6.dp),
    ) {
        Column {
            Image(
                painter = painterResource(affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(affirmation.stringResourceId),
                modifier = Modifier.padding(16.dp),
            )
        }
    }
}

@Preview
@Composable
private fun AffirmationCardPreview() {
    AffirmationCard (Affirmation(R.string.affirmation1, R.drawable.image1))
}

@Preview
@Composable
private fun AffirmationListPreview() {
    MyApplicationTheme {
        AffirmationList(affirmationList = Datasource().loadAffirmations())
    }
}