beans {
    xmlns batch: 'http://www.springframework.org/schema/batch'

	// Job definition
    batch.job(id: 'job1') {
        batch.step(id: 'step1') {
            batch.tasklet {
                batch.chunk(
                    reader: 'reader',
                    writer: 'writer',
                    'commit-interval': 1
                )
            }
        }
    }
}